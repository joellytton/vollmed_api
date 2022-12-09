ALTER TABLE medicos ADD ativo tinyint;
UPDATE medicos SET ativo = 1;
ALTER TABLE medicos MODIFY COLUMN ativo tinyint NOT NULL;