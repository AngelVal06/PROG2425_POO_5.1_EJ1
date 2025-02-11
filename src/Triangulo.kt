class Triangulo(val base: Double, val altura: Double, val lado1: Double, val lado2: Double, color: String): Figura(color) {

    override fun area(): Double {
        val area = (base * altura) / 2
        return area
    }

    override fun perimetro(): Double {
        val peri = lado1 + lado2 + base
        return peri
    }

}