package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_189 {
    private val production = Production3_189("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}