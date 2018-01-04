package org.gradle.test.performance11_5

import org.junit.Assert.*

class Test11_458 {
    private val production = Production11_458("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}