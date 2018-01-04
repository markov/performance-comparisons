package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_189 {
    private val production = Production38_189("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}