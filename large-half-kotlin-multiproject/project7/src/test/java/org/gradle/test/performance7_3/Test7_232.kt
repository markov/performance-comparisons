package org.gradle.test.performance7_3

import org.junit.Assert.*

class Test7_232 {
    private val production = Production7_232("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}