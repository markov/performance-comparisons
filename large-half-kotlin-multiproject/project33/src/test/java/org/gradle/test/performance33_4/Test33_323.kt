package org.gradle.test.performance33_4

import org.junit.Assert.*

class Test33_323 {
    private val production = Production33_323("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}