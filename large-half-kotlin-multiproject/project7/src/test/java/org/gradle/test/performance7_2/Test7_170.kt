package org.gradle.test.performance7_2

import org.junit.Assert.*

class Test7_170 {
    private val production = Production7_170("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}