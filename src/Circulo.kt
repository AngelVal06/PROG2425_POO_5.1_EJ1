class Circulo(val radio: Double, color: String): Figura(color) {

    override fun area(): Double {
        val pi = Math.PI
        val area = pi * radio * radio
        return area
    }

    override fun perimetro(): Double {
        val pi = Math.PI
        val peri = 2 * pi * radio
        return peri
    }

}