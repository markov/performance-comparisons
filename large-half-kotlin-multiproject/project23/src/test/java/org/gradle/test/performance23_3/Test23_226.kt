package org.gradle.test.performance23_3

import org.junit.Assert.*

class Test23_226 {
    private val production = Production23_226("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}