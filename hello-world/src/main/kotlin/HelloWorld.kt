fun hello(name: String = ""): String {
    if (name.trim() == "") {
        return "Hello, World!"
    } else {
        return "Hello, $name!"
    }
}
