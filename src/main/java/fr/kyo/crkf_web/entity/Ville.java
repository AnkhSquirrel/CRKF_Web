package fr.kyo.crkf_web.entity;

import fr.kyo.crkf_web.dao.DAOFactory;

public class Ville {

    private final int villeId;
    private String villeLibelle;
    private float longitude;
    private float latitude;
    private int departementId;

    public Ville(int villeId, String villeLibelle, float longitude, float latitude ,int departementId) {
        this.villeId = villeId;
        this.villeLibelle = villeLibelle;
        this.longitude = longitude;
        this.latitude = latitude;
        this.departementId = departementId;
    }

    public int getVilleId() {
        return villeId;
    }

    public String getVilleLibelle() {
        return villeLibelle;
    }

    public void setVilleLibelle(String villeLibelle) {
        this.villeLibelle = villeLibelle;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public int getDepartementId() {
        return departementId;
    }

    public Departement getDepartementObject() {
        return DAOFactory.getDepartementDAO().getByID(departementId);
    }


    public void setDepartementId(int departement) {
        this.departementId = departement;
    }

    @Override
    public String toString(){
        return villeLibelle;
    }

}
