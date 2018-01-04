package org.gradle.test.performance11_3

import org.junit.Assert.*

class Test11_231 {
    private val production = Production11_231("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}