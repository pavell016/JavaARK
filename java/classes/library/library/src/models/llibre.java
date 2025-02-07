package models;

public class llibre {
    private String autor;
    private String nom;
    private int pagines;
    private String data_pub;
    private String id;
    private boolean prestat;
    private usuari usuari_prestat;

    public llibre(String id, String nom, String autor, int pagines, String data_pub, boolean prestat, usuari usuari_prestat) {
        this.id = id;
        this.nom = nom;
        this.autor = autor;
        this.pagines = pagines;
        this.data_pub = data_pub;
        this.prestat = prestat;
        this.usuari_prestat = usuari_prestat;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPagines() {
        return pagines;
    }

    public void setPagines(int pagines) {
        this.pagines = pagines;
    }

    public String getData_pub() {
        return data_pub;
    }

    public void setData_pub(String data_pub) {
        this.data_pub = data_pub;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isPrestat() {
        return prestat;
    }

    public void setPrestat(boolean prestat) {
        this.prestat = prestat;
    }

    public usuari getUsuari_prestat() {
        return usuari_prestat;
    }

    public void setUsuari_prestat(usuari usuari_prestat) {
        this.usuari_prestat = usuari_prestat;
    }
}
