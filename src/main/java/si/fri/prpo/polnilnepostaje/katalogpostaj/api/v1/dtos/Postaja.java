package si.fri.prpo.polnilnepostaje.katalogpostaj.api.v1.dtos;

public class Postaja {
    private Long id;
    private String ime_postaje;
    private double cena_polnjenja;
    //private Lastnik lastnik;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getIme() {return ime_postaje;}
    public void setIme(String ime) {this.ime_postaje = ime;}
    public double getCena() {return cena_polnjenja;}
    public void setCena(double cena) {this.cena_polnjenja = cena;}
    //public Lastnik getLastnik() {return lastnik;}
    //public void setLastnik(Lastnik l) {this.lastnik = l;}

}
