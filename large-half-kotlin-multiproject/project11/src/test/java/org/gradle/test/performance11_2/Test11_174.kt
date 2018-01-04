package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_174 {
    private val production = Production11_174("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}