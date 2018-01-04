package org.gradle.test.performance11_3

import org.junit.Assert.*

class Test11_254 {
    private val production = Production11_254("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}