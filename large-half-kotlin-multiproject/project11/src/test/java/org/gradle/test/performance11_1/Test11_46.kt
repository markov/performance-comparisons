package org.gradle.test.performance11_1

import org.junit.Assert.*

class Test11_46 {
    private val production = Production11_46("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}