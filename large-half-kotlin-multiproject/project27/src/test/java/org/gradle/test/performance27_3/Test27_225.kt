package org.gradle.test.performance27_3

import org.junit.Assert.*

class Test27_225 {
    private val production = Production27_225("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}