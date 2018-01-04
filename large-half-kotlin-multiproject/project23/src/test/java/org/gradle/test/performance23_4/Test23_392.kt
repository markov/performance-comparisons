package org.gradle.test.performance23_4

import org.junit.Assert.*

class Test23_392 {
    private val production = Production23_392("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}