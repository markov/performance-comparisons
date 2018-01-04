package org.gradle.test.performance11_4

import org.junit.Assert.*

class Test11_323 {
    private val production = Production11_323("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}