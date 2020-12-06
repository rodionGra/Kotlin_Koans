class LazyProperty(val initializer: () -> Int) {
    var tmp : Int? = null
    val lazy: Int
        get() {
            if (tmp == null){
                tmp = initializer()
            }
            return tmp!!
        }
}
