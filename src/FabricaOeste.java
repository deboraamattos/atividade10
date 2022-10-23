public class FabricaOeste extends FabricaDePizza {

    @Override
    public void criarPizza(String tipo) {
        switch (tipo) {
            case "queijo":
                pizza = new PizzaQueijo();
                break;
            case "calabresa":
                pizza = new PizzaCalabresa();
                break;
            case "frango":
                pizza = new PizzaFrango();
                break;

        }
    }
}
