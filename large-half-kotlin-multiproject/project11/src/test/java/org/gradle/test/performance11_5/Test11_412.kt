package org.gradle.test.performance11_5

import org.junit.Assert.*

class Test11_412 {
    private val production = Production11_412("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}