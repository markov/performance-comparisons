package org.gradle.test.performance7_3

import org.junit.Assert.*

class Test7_275 {
    private val production = Production7_275("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}