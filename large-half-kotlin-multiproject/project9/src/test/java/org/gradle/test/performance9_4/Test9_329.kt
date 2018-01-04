package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_329 {
    private val production = Production9_329("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}