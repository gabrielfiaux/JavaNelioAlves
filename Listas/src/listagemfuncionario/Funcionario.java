package listagemfuncionario;

public class Funcionario {
    private int id;
    private String name;
    private Double salary;

    public Funcionario(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                ", id=" + id +  '\n' +
                ", name='" + name + '\n' +
                "salary=" + salary + '\n'+
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
