package org.gradle.test.performance7_3

import org.junit.Assert.*

class Test7_205 {
    private val production = Production7_205("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}