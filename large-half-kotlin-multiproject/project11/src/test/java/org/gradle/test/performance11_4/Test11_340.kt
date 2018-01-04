package org.gradle.test.performance11_4

import org.junit.Assert.*

class Test11_340 {
    private val production = Production11_340("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}