package org.gradle.test.performance27_4

import org.junit.Assert.*

class Test27_307 {
    private val production = Production27_307("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}