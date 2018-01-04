package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_313 {
    private val production = Production31_313("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}