package org.gradle.test.performance13_2

import org.junit.Assert.*

class Test13_189 {
    private val production = Production13_189("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}