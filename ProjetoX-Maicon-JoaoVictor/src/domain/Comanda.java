package domain;

/**
 *
 * @author Maicon /D
 */
public class Comanda {
    private int id;
    private String data;
    private String hora;
    private String desc;
    
    public static int nextId = 0;
    
    public void Incremento(){
        this.id = Comanda.nextId;
        Comanda.nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    
    
}
