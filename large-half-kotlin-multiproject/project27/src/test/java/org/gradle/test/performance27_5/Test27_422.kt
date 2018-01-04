package org.gradle.test.performance27_5

import org.junit.Assert.*

class Test27_422 {
    private val production = Production27_422("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}