public abstract class FabricaDePizza {
        protected Pizza pizza;

        public abstract void criarPizza(String tipo);

        public Pizza delivery() {
            return pizza;
        }


}
