package org.gradle.test.performance11_3

import org.junit.Assert.*

class Test11_206 {
    private val production = Production11_206("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}