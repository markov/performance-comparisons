package org.gradle.test.performance34_1

import org.junit.Assert.*

class Test34_15 {
    private val production = Production34_15("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}