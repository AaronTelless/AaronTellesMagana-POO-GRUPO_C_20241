class Rectangulo extends Shape {
    double largo;
    double ancho;

    Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    double calcularArea() {
        return largo * ancho;
    }

    @Override
    double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}
