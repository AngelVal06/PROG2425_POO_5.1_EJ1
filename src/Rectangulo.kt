class Rectangulo(val base: Double, val altura: Double, color: String): Figura(color) {

    override fun area(): Double {
        val area = base * altura
        return area
    }

    override fun perimetro(): Double {
        val peri = 2 * (base * altura)
        return peri
    }

}