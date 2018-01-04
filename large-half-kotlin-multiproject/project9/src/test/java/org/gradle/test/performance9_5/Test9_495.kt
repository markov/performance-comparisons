package org.gradle.test.performance9_5

import org.junit.Assert.*

class Test9_495 {
    private val production = Production9_495("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}