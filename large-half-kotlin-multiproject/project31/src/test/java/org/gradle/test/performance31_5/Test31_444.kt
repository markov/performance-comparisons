package org.gradle.test.performance31_5

import org.junit.Assert.*

class Test31_444 {
    private val production = Production31_444("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}