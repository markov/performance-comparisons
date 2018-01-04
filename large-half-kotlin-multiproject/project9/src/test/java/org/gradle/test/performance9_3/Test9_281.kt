package org.gradle.test.performance9_3

import org.junit.Assert.*

class Test9_281 {
    private val production = Production9_281("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}