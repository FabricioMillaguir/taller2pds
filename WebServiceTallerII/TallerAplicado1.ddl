ALTER TABLE Cliente_historico DROP CONSTRAINT FKCliente_hi935652;
ALTER TABLE Cuenta DROP CONSTRAINT FKCuenta484729;
ALTER TABLE Cliente DROP CONSTRAINT FKCliente504764;
ALTER TABLE Cliente_historico DROP CONSTRAINT FKCliente_hi128522;
ALTER TABLE Cuenta DROP CONSTRAINT FKCuenta951582;
ALTER TABLE Consumo DROP CONSTRAINT FKConsumo137107;
ALTER TABLE Consumo DROP CONSTRAINT FKConsumo576021;
ALTER TABLE Login DROP CONSTRAINT FKLogin220878;
ALTER TABLE Cuenta DROP CONSTRAINT FKCuenta422686;
DROP TABLE Cliente;
DROP TABLE Cliente_historico;
DROP TABLE Cuenta;
DROP TABLE Login;
DROP TABLE Servicio;
DROP TABLE Consumo;
DROP TABLE Administrador;
CREATE TABLE Cliente (id int NOT NULL, nombre varchar(30) NOT NULL, apellido_paterno varchar(20) NOT NULL, apellido_materno varchar(20) NOT NULL, rut varchar(10) NOT NULL, celular varchar(10) NOT NULL, correo varchar(50) NOT NULL, direccion varchar(50) NOT NULL, Logintoken varchar(21) NULL, PRIMARY KEY (id));
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Id del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'id';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Nombre del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'nombre';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Apellido Paterno del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'apellido_paterno';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Apellido Materno del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'apellido_materno';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Rut del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'rut';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Celular del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'celular';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Correo del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'correo';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Direccion del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'direccion';
CREATE TABLE Cliente_historico (id int NOT NULL, nombre varchar(30) NOT NULL, apellido_paterno varchar(20) NOT NULL, apellido_materno varchar(20) NOT NULL, rut varchar(10) NOT NULL, celular varchar(10) NOT NULL, correo varchar(50) NOT NULL, direccion varchar(50) NOT NULL, Clienteid int NOT NULL, fecha_cambio date NOT NULL, Logintoken varchar(21) NULL, PRIMARY KEY (id));
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Cambio historico del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente_historico';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Id del Cambio historico del cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente_historico', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'id';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Nombre Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente_historico', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'nombre';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Apellido Paterno del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente_historico', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'apellido_paterno';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Apellido Materno del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente_historico', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'apellido_materno';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Rut del cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente_historico', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'rut';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Numero de celular del cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente_historico', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'celular';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'E-mail del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente_historico', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'correo';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Direccion del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente_historico', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'direccion';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Id del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente_historico', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'Clienteid';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Fecha del cambio', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cliente_historico', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'fecha_cambio';
CREATE TABLE Cuenta (id int NOT NULL, habilitada bit NOT NULL, Clienteid int NOT NULL, Servicioid int NOT NULL, Logintoken varchar(21) NULL, PRIMARY KEY (id));
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Cuenta', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cuenta';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Id de la Cuenta', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cuenta', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'id';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Habilitada si o no', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cuenta', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'habilitada';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Id del Cliente', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cuenta', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'Clienteid';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Id del servicio', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Cuenta', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'Servicioid';
CREATE TABLE Login (token varchar(21) NOT NULL, tiempo_inicio bigint NOT NULL, Administradorid int NOT NULL, PRIMARY KEY (token));
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Login', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Login';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Token del login', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Login', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'token';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Fecha inicio Login', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Login', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'tiempo_inicio';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Id del administrador', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Login', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'Administradorid';
CREATE TABLE Servicio (id int NOT NULL, tipo_servicio varchar(255) NOT NULL, unidad_de_medida varchar(255) NULL, valor_unitario int NOT NULL, cargo_fijo int NOT NULL, PRIMARY KEY (id));
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Servicio', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Servicio';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Id del servicio', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Servicio', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'id';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Tipo de servicio', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Servicio', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'tipo_servicio';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Unidad de medida del servicio', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Servicio', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'unidad_de_medida';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Valor por unidad', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Servicio', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'valor_unitario';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Cargo fijo del servicio', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Servicio', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'cargo_fijo';
CREATE TABLE Consumo (id int NOT NULL, cantidad_consumida int NOT NULL, pagado bit NOT NULL, moroso bit NOT NULL, fecha_vencimiento varchar(25) NOT NULL, total_a_pagar int NOT NULL, Cuentaid int NOT NULL, Logintoken varchar(21) NULL, PRIMARY KEY (id));
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Consumo', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Consumo';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Id del consumo', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Consumo', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'id';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'cantidad consumido', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Consumo', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'cantidad_consumida';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Pagado si o no', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Consumo', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'pagado';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Morosidad del consumo si o no', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Consumo', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'moroso';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Fecha de vencimiento del consumo', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Consumo', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'fecha_vencimiento';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Total a pagar del consumo', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Consumo', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'total_a_pagar';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Id de la cuenta', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Consumo', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'Cuentaid';
CREATE TABLE Administrador (id int NOT NULL, usuario varchar(20) NOT NULL, clave varchar(20) NOT NULL, PRIMARY KEY (id));
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Administrador', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Administrador';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Id del administrador', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Administrador', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'id';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Usuario', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Administrador', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'usuario';
EXEC sp_addextendedproperty @NAME = N'MS_Description', @VALUE = 'Clave', @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'Administrador', @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'clave';
ALTER TABLE Cliente_historico ADD CONSTRAINT FKCliente_hi935652 FOREIGN KEY (Clienteid) REFERENCES Cliente (id);
ALTER TABLE Cuenta ADD CONSTRAINT FKCuenta484729 FOREIGN KEY (Clienteid) REFERENCES Cliente (id);
ALTER TABLE Cliente ADD CONSTRAINT FKCliente504764 FOREIGN KEY (Logintoken) REFERENCES Login (token);
ALTER TABLE Cliente_historico ADD CONSTRAINT FKCliente_hi128522 FOREIGN KEY (Logintoken) REFERENCES Login (token);
ALTER TABLE Cuenta ADD CONSTRAINT FKCuenta951582 FOREIGN KEY (Servicioid) REFERENCES Servicio (id);
ALTER TABLE Consumo ADD CONSTRAINT FKConsumo137107 FOREIGN KEY (Cuentaid) REFERENCES Cuenta (id);
ALTER TABLE Consumo ADD CONSTRAINT FKConsumo576021 FOREIGN KEY (Logintoken) REFERENCES Login (token);
ALTER TABLE Login ADD CONSTRAINT FKLogin220878 FOREIGN KEY (Administradorid) REFERENCES Administrador (id);
ALTER TABLE Cuenta ADD CONSTRAINT FKCuenta422686 FOREIGN KEY (Logintoken) REFERENCES Login (token);