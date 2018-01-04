package org.gradle.test.performance23_3

import org.junit.Assert.*

class Test23_227 {
    private val production = Production23_227("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}