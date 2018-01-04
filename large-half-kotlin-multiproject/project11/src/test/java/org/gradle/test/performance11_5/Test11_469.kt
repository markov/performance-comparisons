package org.gradle.test.performance11_5

import org.junit.Assert.*

class Test11_469 {
    private val production = Production11_469("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}