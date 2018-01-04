package org.gradle.test.performance33_5

import org.junit.Assert.*

class Test33_415 {
    private val production = Production33_415("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}