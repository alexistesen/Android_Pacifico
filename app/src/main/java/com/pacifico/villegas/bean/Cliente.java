package com.pacifico.villegas.bean;

public class Cliente {

    private String cod_afiliado;
    private String descripcion;
    private String apellidos_nombres_concat;
    private String fec_nacimiento;
    private String fec_afiliacion;
    private String cod_afiliado_vinculacion;
    private String apellido_paterno;
    private String apellido_materno;
    private String primer_nombre;
    private String segundo_nombre;
    private String nombres_apellidos_concat;
    private String sexo;
    private String nro_documento;
    private String cod_cliente;
    private String nro_plan;
    private String des_cliente;
    private String edad;
    private String nro_dep;
    private String codigo_trabajador;
    private String tipo_entidad_salud;
    private String cod_entidad_salud;
    private String apellidos_comun;
    private String cod_centro_costo_cliente;
    private String cod_centro_costo;
    private String cod_centro_costo_grupo;
    private String des_centro_costo2;
    private String desc_plan;
    private String cod_broker;
    private String desc_broker;

    public Cliente(){

    }

    public Cliente(String codigo, String nombres){
        cod_afiliado = codigo;
        apellidos_nombres_concat = nombres;
    }

    public String getCod_afiliado() {
        return cod_afiliado;
    }

    public void setCod_afiliado(String cod_afiliado) {
        this.cod_afiliado = cod_afiliado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getApellidos_nombres_concat() {
        return apellidos_nombres_concat;
    }

    public void setApellidos_nombres_concat(String apellidos_nombres_concat) {
        this.apellidos_nombres_concat = apellidos_nombres_concat;
    }

    public String getFec_nacimiento() {
        return fec_nacimiento;
    }

    public void setFec_nacimiento(String fec_nacimiento) {
        this.fec_nacimiento = fec_nacimiento;
    }

    public String getFec_afiliacion() {
        return fec_afiliacion;
    }

    public void setFec_afiliacion(String fec_afiliacion) {
        this.fec_afiliacion = fec_afiliacion;
    }

    public String getCod_afiliado_vinculacion() {
        return cod_afiliado_vinculacion;
    }

    public void setCod_afiliado_vinculacion(String cod_afiliado_vinculacion) {
        this.cod_afiliado_vinculacion = cod_afiliado_vinculacion;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getNombres_apellidos_concat() {
        return nombres_apellidos_concat;
    }

    public void setNombres_apellidos_concat(String nombres_apellidos_concat) {
        this.nombres_apellidos_concat = nombres_apellidos_concat;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) {
        this.nro_documento = nro_documento;
    }

    public String getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(String cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNro_plan() {
        return nro_plan;
    }

    public void setNro_plan(String nro_plan) {
        this.nro_plan = nro_plan;
    }

    public String getDes_cliente() {
        return des_cliente;
    }

    public void setDes_cliente(String des_cliente) {
        this.des_cliente = des_cliente;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNro_dep() {
        return nro_dep;
    }

    public void setNro_dep(String nro_dep) {
        this.nro_dep = nro_dep;
    }

    public String getCodigo_trabajador() {
        return codigo_trabajador;
    }

    public void setCodigo_trabajador(String codigo_trabajador) {
        this.codigo_trabajador = codigo_trabajador;
    }

    public String getTipo_entidad_salud() {
        return tipo_entidad_salud;
    }

    public void setTipo_entidad_salud(String tipo_entidad_salud) {
        this.tipo_entidad_salud = tipo_entidad_salud;
    }

    public String getCod_entidad_salud() {
        return cod_entidad_salud;
    }

    public void setCod_entidad_salud(String cod_entidad_salud) {
        this.cod_entidad_salud = cod_entidad_salud;
    }

    public String getApellidos_comun() {
        return apellidos_comun;
    }

    public void setApellidos_comun(String apellidos_comun) {
        this.apellidos_comun = apellidos_comun;
    }

    public String getCod_centro_costo_cliente() {
        return cod_centro_costo_cliente;
    }

    public void setCod_centro_costo_cliente(String cod_centro_costo_cliente) {
        this.cod_centro_costo_cliente = cod_centro_costo_cliente;
    }

    public String getCod_centro_costo() {
        return cod_centro_costo;
    }

    public void setCod_centro_costo(String cod_centro_costo) {
        this.cod_centro_costo = cod_centro_costo;
    }

    public String getCod_centro_costo_grupo() {
        return cod_centro_costo_grupo;
    }

    public void setCod_centro_costo_grupo(String cod_centro_costo_grupo) {
        this.cod_centro_costo_grupo = cod_centro_costo_grupo;
    }

    public String getDes_centro_costo2() {
        return des_centro_costo2;
    }

    public void setDes_centro_costo2(String des_centro_costo2) {
        this.des_centro_costo2 = des_centro_costo2;
    }

    public String getDesc_plan() {
        return desc_plan;
    }

    public void setDesc_plan(String desc_plan) {
        this.desc_plan = desc_plan;
    }

    public String getCod_broker() {
        return cod_broker;
    }

    public void setCod_broker(String cod_broker) {
        this.cod_broker = cod_broker;
    }

    public String getDesc_broker() {
        return desc_broker;
    }

    public void setDesc_broker(String desc_broker) {
        this.desc_broker = desc_broker;
    }
}
