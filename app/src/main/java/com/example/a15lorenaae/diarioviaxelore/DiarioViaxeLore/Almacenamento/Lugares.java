package com.example.a15lorenaae.diarioviaxelore.DiarioViaxeLore.Almacenamento;

/**
 * Created by a15lorenaae on 11/23/15.
 */
public class Lugares {
    private long _id;
    private String nome;
    private String descripcion;
//	private ArrayList<LatLng>coordenadasGPS;		=> Ata que non importemos os Google Play Services non podemos usar o tipo LatLng



    public Lugares(long id, String nome, String descripcion){
        this._id=id;
        this.nome=nome;
        this.descripcion=descripcion;

//		coordenadasGPS = new ArrayList<LatLng>();	=> Ata que non importemos os Google Play Services non podemos usar o tipo LatLng
    }


    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

}
