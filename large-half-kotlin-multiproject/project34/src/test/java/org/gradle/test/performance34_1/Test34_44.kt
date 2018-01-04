package org.gradle.test.performance34_1

import org.junit.Assert.*

class Test34_44 {
    private val production = Production34_44("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}