package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_329 {
    private val production = Production31_329("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}