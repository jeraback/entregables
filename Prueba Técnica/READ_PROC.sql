create or replace procedure "READ_PROC"
(p_id IN OUT NUMBER,
p_sku IN OUT VARCHAR2,
p_fert IN OUT VARCHAR2,
p_modelo IN OUT VARCHAR2,
p_tipo IN OUT VARCHAR2,
p_num_serie IN OUT VARCHAR2,
p_fecha IN OUT DATE,
p_action IN NUMBER)
is
 
begin
    if p_action = 1 then 
select id, fert, modelo, tipo, num_serie, fecha
into p_id, p_fert, p_modelo, p_tipo, p_num_serie, p_fecha
from italika
where sku = p_sku;
end if;
 
if p_action = 4 then 
select id, sku, fert, tipo, num_serie, fecha
into p_id, p_sku, p_fert, p_tipo, p_num_serie, p_fecha
from italika
where modelo = p_modelo;
end if;
 
 if p_action = 2 then
    insert into italika (sku, fert, modelo, tipo, num_serie, fecha)
    values (p_sku, p_fert, p_modelo, p_tipo, p_num_serie, p_fecha);
end if;
 
if p_action = 3 then
    delete from italika 
    where sku = p_sku;
 
end if;
 
if p_action = 5 then
    update italika 
    set sku = p_sku, fert = p_fert, modelo = p_modelo, tipo = p_tipo, num_serie = p_num_serie, fecha = p_fecha
    where id = p_id;
commit;
 
 
end if;
 
 
end;
