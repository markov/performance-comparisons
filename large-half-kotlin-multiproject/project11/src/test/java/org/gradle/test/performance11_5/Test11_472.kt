package org.gradle.test.performance11_5

import org.junit.Assert.*

class Test11_472 {
    private val production = Production11_472("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}