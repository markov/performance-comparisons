package org.gradle.test.performance7_4

import org.junit.Assert.*

class Test7_391 {
    private val production = Production7_391("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}