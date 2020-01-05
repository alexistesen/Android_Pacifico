package com.pacifico.villegas.Utilitarios;

public class Constantes {

    //NOMBRE DE LA BASE DE DATOS
    public static final String DB_NAME = "pacifico.db";

    //NOMBRE DE LA TABLA
    public static final String TABLA_1 = "tb_sunat";

    //CAMPOS DE LA TABLA DE CLIENTES SUNAT
    public static final String Campo1 =  "cod_afiliado";
    public static final String Campo2 =  "descripcion";
    public static final String Campo3 =  "apellidos_nombres_concat";
    public static final String Campo4 =  "fec_nacimiento";
    public static final String Campo5 =  "fec_afiliacion";
    public static final String Campo6 =  "cod_afiliado_vinculacion";
    public static final String Campo7 =  "apellido_paterno";
    public static final String Campo8 =  "apellido_materno";
    public static final String Campo9 =  "primer_nombre";
    public static final String Campo10 =  "segundo_nombre";
    public static final String Campo11 =  "nombres_apellidos_concat";
    public static final String Campo12 =  "sexo";
    public static final String Campo13 =  "nro_documento";
    public static final String Campo14 =  "cod_cliente";
    public static final String Campo15 =  "nro_plan";
    public static final String Campo16 =  "des_cliente";
    public static final String Campo17 =  "edad";
    public static final String Campo18 =  "nro_dep";
    public static final String Campo19 =  "codigo_trabajador";
    public static final String Campo20 =  "tipo_entidad_salud";
    public static final String Campo21 =  "cod_entidad_salud";
    public static final String Campo22 =  "apellidos_comun";
    public static final String Campo23 =  "cod_centro_costo_cliente";
    public static final String Campo24 =  "cod_centro_costo";
    public static final String Campo25 =  "cod_centro_costo_grupo";
    public static final String Campo26 =  "des_centro_costo2";
    public static final String Campo27 =  "desc_plan";
    public static final String Campo28 =  "cod_broker";
    public static final String Campo29 =  "desc_broker";

    //PARA CREAR LA TABLA
    public static final String CREAR_TABLA_1 ="CREATE TABLE "+TABLA_1+" ("+Campo1+" TEXT PRIMARY KEY, "+
            Campo2+" TEXT, "+
            Campo3+" TEXT, "+
            Campo4+" TEXT, "+
            Campo5+" TEXT, "+
            Campo6+" TEXT, "+
            Campo7+" TEXT, "+
            Campo8+" TEXT, "+
            Campo9+" TEXT, "+
            Campo10+" TEXT, "+
            Campo11+" TEXT, "+
            Campo12+" TEXT, "+
            Campo13+" TEXT, "+
            Campo14+" TEXT, "+
            Campo15+" TEXT, "+
            Campo16+" TEXT, "+
            Campo17+" TEXT, "+
            Campo18+" TEXT, "+
            Campo19+" TEXT, "+
            Campo20+" TEXT, "+
            Campo21+" TEXT, "+
            Campo22+" TEXT, "+
            Campo23+" TEXT, "+
            Campo24+" TEXT, "+
            Campo25+" TEXT, "+
            Campo26+" TEXT, "+
            Campo27+" TEXT, "+
            Campo28+" TEXT, "+
            Campo29+" TEXT)";
}
